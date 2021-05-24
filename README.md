# SpringCloudLocal

A basic Spring Cloud project utilizing service discovery, tracing, load balancing and more.
<br>

- `web`: The 'entrypoint' to the project. This calls to the `name` and `greeting` web services that help concatenate a basic 'hello <name>' response or 'hello stranger' if no name argument is supplied.
- `name`: Checks if a name argument is supplied. If not, it reaches out to the Config server for its default value to be returned.
- `greeting`: Returns a simple 'Hello'. Grabs this value from the Config server (to make use of the concept of the Config Server).
- `config`: Holds all service related .yml files that the `configserver` retrieves for the services.
- `configserver`: Grabs all related config .yml files from the Github repository for all the services that have the config starter dependency and look for this upon startup/runtime.
- `eurkaserver`: Netflix Eureka server. Enables service discovery and for any registered Discovery Client to be registered.
- `zipkinserver`: Enables request tracing lookup through it's dashboard for the services that are set up for request tracing. This includes a .sh script that can either pull and run the quickstart Zipkin Docker Image and be ran as a container or make a `curl` request to download and run the jar file locally.
  
 <br>
  
  Deployment: This is configured to be able to be deployed to Azure Spring Cloud. For the `web`, `name` and `greeting` services - the Maven package `spring-cloud-starter-azure-spring-cloud-client` has already been added for Service Discovery specific to Azure. If running locally, uncomment any needed configuration in the service associated `.yml` files.
