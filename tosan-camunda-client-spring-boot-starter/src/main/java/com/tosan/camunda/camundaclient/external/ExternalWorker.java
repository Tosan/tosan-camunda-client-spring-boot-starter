package com.tosan.camunda.camundaclient.external;

import com.tosan.camunda.api.Worker;
import org.camunda.bpm.client.task.ExternalTaskHandler;

/**
 * for applying external task related aspects, this interface must be implemented by external worker class
 *
 * @author M.khoshnevisan
 * @since 10/27/2021
 */
public interface ExternalWorker extends ExternalTaskHandler {

    Worker getWorker();
}
