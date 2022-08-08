package com.example.shade

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.delta.DeltaLog
class DeltaDependent {

  def getVersion: Long = {


    val spark = null
    val path = "somePath"

    // val deltaTableUsingDB = com.databricks.sql.transaction.tahoe.DeltaLog.forTable(spark, path)

    val deltaTable = DeltaLog.forTable(spark.asInstanceOf[SparkSession], path)
    deltaTable.doLogCleanup()
    deltaTable.snapshot.version


  }
}
