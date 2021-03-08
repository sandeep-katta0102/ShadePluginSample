# ShadePluginSample

This project explain how to use opensource delta and compile the code with shade plugin.

For e.g Open source Delta has the **org.apache.spark.sql.delta** package, where as DBR has **com.databricks.sql.transaction.tahoe** .
So when you compile with Open Source dependencies and run in DBR it will fail.

This project make use of **maven-shade-plugin** plugin to redirect the Open Source package to DBR package.

Can refer **pom.xml** for the usage.

Note: It is always required to compile the delta code with same as the version supported for respective DBR version
