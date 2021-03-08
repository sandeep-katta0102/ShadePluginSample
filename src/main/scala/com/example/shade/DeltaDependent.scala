package com.example.shade

// import org.apache.spark.sql.delta.DeltaTable
import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.delta.DeltaLog
class DeltaDependent {

  def getVersion: Long = {


    val spark = null
    val path = "somePath"

    // val deltaTableUsingDB = com.databricks.sql.transaction.tahoe.DeltaLog.forTable(spark, path)

    val deltaTable = DeltaLog.forTable(spark.asInstanceOf[SparkSession], path)
    deltaTable.snapshot.version
    deltaTable.doLogCleanup()



//    %scala
//    import com.databricks.sql.transaction.tahoe._
//
//    val deltaLog = com.databricks.sql.transaction.tahoe.DeltaLog.forTable(spark, deltaTablePath)
//    val currentFiles = deltaLog.snapshot.allFiles
//    display(currentFiles.groupBy("partitionValues.col1", "partitionValues.col2")
//      .count().orderBy($"count".desc))
  }
}
