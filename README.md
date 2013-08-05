OBroker 
=======

A test implementation of an Ontology Term Broker.

http://neurocommons.org/page/Ontological_term_broker

The original implementation of this was built on top of Jetty with "raw" Servlets -- I'm currently adapting it so that it's built using JAX-RS (and the Jersey implementation of JAX-RS).

Changelog
=========

Version 1.0.2
* Adding integration testing
* Moving to a WAR package format
* Removing the Jetty-specific code, including any embedded Jetty components.
* Packaging the schema files in the WAR itself, instead of requiring a separate distribution.
