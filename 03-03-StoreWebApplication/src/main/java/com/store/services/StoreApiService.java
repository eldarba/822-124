package com.store.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

public class StoreApiService {

	@Autowired
	DiscoveryClient discoveryClient;

	public URI getServiceInstanceBaseUri(String serviceName) {
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
		return serviceInstances.get(0).getUri();
		// for now assume there is only 1 instance for each service
	}

}
