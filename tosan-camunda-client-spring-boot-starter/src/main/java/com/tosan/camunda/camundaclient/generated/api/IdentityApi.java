/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.30).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tosan.camunda.camundaclient.generated.api;

import com.tosan.camunda.camundaclient.generated.model.AuthenticationResult;
import com.tosan.camunda.camundaclient.generated.model.BasicUserCredentialsDto;
import com.tosan.camunda.camundaclient.generated.model.CheckPasswordPolicyResultDto;
import com.tosan.camunda.camundaclient.generated.model.ExceptionDto;
import com.tosan.camunda.camundaclient.generated.model.IdentityServiceGroupInfoDto;
import com.tosan.camunda.camundaclient.generated.model.PasswordPolicyDto;
import com.tosan.camunda.camundaclient.generated.model.PasswordPolicyRequestDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.Optional;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-17T19:18:35.625055400+04:30[Asia/Tehran]")
@Validated
public interface IdentityApi {

    Logger log = LoggerFactory.getLogger(IdentityApi.class);

    Optional<ObjectMapper> getObjectMapper();

    Optional<HttpServletRequest> getRequest();

    

    @Operation(summary = "Validate Password", description = "A password policy consists of a list of rules that new passwords must follow to be policy compliant. A password can be checked for compliancy via this end point. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.17/user-guide/security/).", tags={ "Identity" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules. The checked password is myPassword which is not complex enough to match all of the policy rules.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = CheckPasswordPolicyResultDto.class))),
        
        @ApiResponse(responseCode = "404", description = "No password policy was found to check the password against.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/identity/password-policy",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<CheckPasswordPolicyResultDto> checkPassword(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody PasswordPolicyRequestDto body);


    @Operation(summary = "Get a User's Groups", description = "Gets the groups of a user by id and includes all users that share a group with the given user.", tags={ "Identity" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = IdentityServiceGroupInfoDto.class))),
        
        @ApiResponse(responseCode = "400", description = "If the `userId` query parameter is missing. See the [Introduction](https://docs.camunda.org/manual/7.17/reference/rest/overview/#error-handling) for the error response format.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/identity/groups",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<IdentityServiceGroupInfoDto> getGroupInfo(@NotNull @Parameter(in = ParameterIn.QUERY, description = "The id of the user to get the groups for." ,required=true,schema=@Schema()) @Valid @RequestParam(value = "userId", required = true) String userId);


    @Operation(summary = "Get Password Policy", description = "A password policy consists of a list of rules that new passwords must follow to be policy compliant. This end point returns a JSON representation of the list of policy rules. More information on password policies in Camunda can be found in the password policy [user guide](https://docs.camunda.org/manual/7.17/user-guide/process-engine/password-policy/) and in the [security instructions](https://docs.camunda.org/manual/7.17/user-guide/security/).", tags={ "Identity" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful. This example uses the built-in password policy that enforces a minimum password length, and some complexity rules.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = PasswordPolicyDto.class))),
        
        @ApiResponse(responseCode = "404", description = "No password policy was found.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/identity/password-policy",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PasswordPolicyDto> getPasswordPolicy();


    @Operation(summary = "Verify User", description = "Verifies that user credentials are valid.", tags={ "Identity" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Request successful.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = AuthenticationResult.class))),
        
        @ApiResponse(responseCode = "400", description = "If body does not contain username or password.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class))) })
    @RequestMapping(value = "/identity/verify",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<AuthenticationResult> verifyUser(@Parameter(in = ParameterIn.DEFAULT, description = "", schema=@Schema()) @Valid @RequestBody BasicUserCredentialsDto body);

}

