package com.tosan.camunda.camundaclient.external;

import com.tosan.camunda.api.Worker;
import com.tosan.camunda.camundaclient.config.ExternalTaskInfo;
import org.camunda.bpm.client.task.ExternalTask;
import org.camunda.bpm.client.task.ExternalTaskHandler;

import static com.tosan.camunda.camundaclient.external.ExternalTaskService.getTaskInfo;

/**
 * for applying external task related aspects, this interface must be implemented by external worker class
 *
 * @author M.khoshnevisan
 * @since 10/27/2021
 */
public interface ExternalWorker extends ExternalTaskHandler {

    Worker getWorker();

    default ExternalTaskInfo getExternalTaskInfo(ExternalTask externalTask) {
        return getTaskInfo(externalTask);
    }
}
