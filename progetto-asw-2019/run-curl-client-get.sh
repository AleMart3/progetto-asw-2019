#!/bin/bash

# itera la richiesta 5 volte 

for i in {1..5}; do 
	curl localhost:8080/api-gateway/a-service
	echo "" ; 
done 
