# Introduction
Microservice is a popular architecture in software engineer. this architecture
can implemented by any eminent framework in Java, like OSGi or Spring. In this 
project we want to implement Microservice by Spring Cloud.
This project contained forth microservice cif-service, lending-service, treasury-service
and ui-service. The module ui-service up on 8585 you will see as blow table:


 ![home page screenshoe](pics/home-page.JPG)
 
 
 All available links listed on this table and you can switch into any pages by
 pressing button 'Go to page' on attribute row of table.
 
 
 ![service map](pics/service-map.JPG)
 
 
 ## Links
 * ```/cif-all``` : this page show all user data that registered in system.
 * ```/lending-all``` : this page show all lends that any user use them, announced by
 national identity of user.
 * ```/treasury-all``` : this page show reminded users money.
 * ```/total-info``` : this page contained data of three microservices CIF, LENDING an TREASURY. this 
 page designed for show benefit of using circuit break pattern that implemented by spring cloud. (I strongly suggest you
 that disable every microservice and discern it)
 
 # How to use
 Run following modules (order is important):
 * eureka-server (it can be monitored via [http://localhost:8761](http://localhost:8761)) 
 * config-server 
 * cif-service, lending-service, treasury-service, ui-service
 
 Eureka come up on 8761 and you can see page as follow:
 
 
 ![eureka service table](pics/eureka-service-table.JPG)
 