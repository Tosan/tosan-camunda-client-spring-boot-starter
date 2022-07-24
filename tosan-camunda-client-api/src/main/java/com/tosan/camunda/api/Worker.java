package com.tosan.camunda.api;

/**
 * enum of worker names must implement this interface in order to roll in log
 *
 * @author M.khoshnevisan
 * @since 1/23/2022
 */
public interface Worker {
    String getWorkerName();
}
