package com.store.services;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;

public class StoreApiService {

	@Autowired
	DiscoveryClient discoveryClient;
	@Autowired
	LoadBalancerClient loadBalancerClient;

	public URI getServiceInstanceBaseUri(String serviceName) {
		// System.out.println(discoveryClient.getServices());
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances(serviceName);
		return serviceInstances.get(0).getUri();
		// for now assume there is only 1 instance for each service
	}

//	public URI getServiceInstanceBaseUriLoadBalanced(String serviceName) {
//		// System.out.println(discoveryClient.getServices());
//		ServiceInstance serviceInstance = loadBalancerClient.choose(serviceName);
//		URI uri = serviceInstance.getUri();
//		return uri;
//	}

	public String getServiceInstanceBaseUriLoadBalanced(String serviceName) {
		String baseUri = "http://" + serviceName;
		return baseUri;
	}

}
