# Progetto 1D

## Ambiente di esecuzione 

Questa applicazione può essere costruita ed eseguita in un ambiente in cui vi siano installati:

* Java SDK (Open JDK) 
  
* Gradle 

* Docker 

* Docker compose 

Vanno però utilizzate più finestre (terminali) diverse. In genere, una per l'applicazione ed una per il suo client.


## Build (Java) 

Per la costruzione dell'applicazione, eseguire il comando `gradle assemble` oppure `gradle build`, oppure eseguire lo script `build-java-projects.sh`

## Build (Docker) 

Per la costruzione delle immagini Docker, eseguire lo script `build-docker-images-with-compose.sh` 

## Esecuzione 

Ci possono essere più istanze del servizio A e del servizio C. Ciascuna di esse deve  avere  un  nome  diverso.
In questo caso ci sono due istanze del servizio A (Alice e Alberto) e due istanze del servizio C (Carlo e Chiara).

Per eseguire l'applicazione, eseguire lo script `run-with-compose.sh.`

E' possibile eseguire richieste POST e GET al servizio A all'url `localhost:8080/api-gateway/a-service`

L'applicazione può essere verificata usando lo script `run-curl-client-get.sh` per le richieste GET e lo script `run-curl-client-post.sh` per le richieste POST.

È necessario attendere alcuni minuti per il completo avvio dell'applicazione al fine di evitare errori a seguito di richieste. 

## Arresto 

Per arrestare l'applicazione, eseguire lo script `stop-with-compose.sh` 


## Esecuzione con più istanze del servizio A e del servizio C

Per modificare il numero di istanze è necessario modificare i file:

* `application.yml` delle applicazioni **a-service** e **c-service**

* `docker-compose.yml`

