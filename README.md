# OpenOSN

<b>Organizational Social Network Project</b>

<h3>Main modules:</h3>

* <b>Profiling</b>
* <b>Social network</b>
* <b>File manager</b>
* <b>Chat</b>
* <b>Mailbox</b>
* <b>ERP</b>

<h3>Tools and frameworks:</h3>

* <b>Java 17</b>
* <b>Spring Cloud</b>
* <b>Postgresql</b>

<h3>Services:</h3>

* <b>User rests service:</b><br/>&emsp;This service contains all rests needed for user information.
  include crud rests for personal and organizational information.
* <b>Social network rests service:</b><br/>&emsp;This service contains all rests needed for social network such as posts
  management.
* <b>Authentication service:</b><br/>&emsp;This service contains user login and logout and session management and also user
  accesses and privileges management rests.
* <b>File content service:</b><br/>&emsp;This service contains rests for upload and download files.
* <b>Files metadata service:</b> <br/>&emsp;This service contains rests for manage list of files and share files.
* <b>Api gateway service:</b><br/>&emsp;This service is needed to integrate all microservices rests.
* <b>Config server service:</b><br/>&emsp;This service is needed to centralize configs.
* <b>Eureka server service:</b><br/>&emsp;This service is needed to discover all services.
* <b>Circuit breaker service:</b><br/>&emsp;This service provides resilience and retry ability



