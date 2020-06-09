/**
 * Generated by Scrooge
 *   version: 19.12.0
 *   rev: dfdb68cf6b9c501dbbe3ae644504bf403ad76bfa
 *   built at: 20191212-171820
 */
package org.apache.hive.service.rpc.thrift

import com.twitter.scrooge.ThriftEnum
import scala.collection.immutable.{Map => immutable$Map}


@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
case object TStatusCode extends _root_.com.twitter.scrooge.ThriftEnumObject[TStatusCode] {

  val annotations: immutable$Map[String, String] = immutable$Map.empty

  
  case object SuccessStatus extends org.apache.hive.service.rpc.thrift.TStatusCode {
    val value: Int = 0
    val name: String = "SuccessStatus"
    val originalName: String = "SUCCESS_STATUS"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeSuccessStatus = _root_.scala.Some(org.apache.hive.service.rpc.thrift.TStatusCode.SuccessStatus)
  
  case object SuccessWithInfoStatus extends org.apache.hive.service.rpc.thrift.TStatusCode {
    val value: Int = 1
    val name: String = "SuccessWithInfoStatus"
    val originalName: String = "SUCCESS_WITH_INFO_STATUS"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeSuccessWithInfoStatus = _root_.scala.Some(org.apache.hive.service.rpc.thrift.TStatusCode.SuccessWithInfoStatus)
  
  case object StillExecutingStatus extends org.apache.hive.service.rpc.thrift.TStatusCode {
    val value: Int = 2
    val name: String = "StillExecutingStatus"
    val originalName: String = "STILL_EXECUTING_STATUS"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeStillExecutingStatus = _root_.scala.Some(org.apache.hive.service.rpc.thrift.TStatusCode.StillExecutingStatus)
  
  case object ErrorStatus extends org.apache.hive.service.rpc.thrift.TStatusCode {
    val value: Int = 3
    val name: String = "ErrorStatus"
    val originalName: String = "ERROR_STATUS"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeErrorStatus = _root_.scala.Some(org.apache.hive.service.rpc.thrift.TStatusCode.ErrorStatus)
  
  case object InvalidHandleStatus extends org.apache.hive.service.rpc.thrift.TStatusCode {
    val value: Int = 4
    val name: String = "InvalidHandleStatus"
    val originalName: String = "INVALID_HANDLE_STATUS"
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  private[this] val _SomeInvalidHandleStatus = _root_.scala.Some(org.apache.hive.service.rpc.thrift.TStatusCode.InvalidHandleStatus)

  case class EnumUnknownTStatusCode(value: Int)
    extends org.apache.hive.service.rpc.thrift.TStatusCode with _root_.com.twitter.scrooge.EnumItemUnknown
  {
    val name: String = "EnumUnknownTStatusCode" + value
    def originalName: String = name
    val annotations: immutable$Map[String, String] = immutable$Map.empty
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   */
  def apply(value: Int): org.apache.hive.service.rpc.thrift.TStatusCode =
    value match {
      case 0 => org.apache.hive.service.rpc.thrift.TStatusCode.SuccessStatus
      case 1 => org.apache.hive.service.rpc.thrift.TStatusCode.SuccessWithInfoStatus
      case 2 => org.apache.hive.service.rpc.thrift.TStatusCode.StillExecutingStatus
      case 3 => org.apache.hive.service.rpc.thrift.TStatusCode.ErrorStatus
      case 4 => org.apache.hive.service.rpc.thrift.TStatusCode.InvalidHandleStatus
      case _ => throw new NoSuchElementException(value.toString)
    }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * returns an EnumUnknownTStatusCode(value) if the value is not found.
   * In particular this allows ignoring new values added to an enum
   * in the IDL on the producer side when the consumer was not updated.
   */
  def getOrUnknown(value: Int): org.apache.hive.service.rpc.thrift.TStatusCode =
    get(value) match {
      case _root_.scala.Some(e) => e
      case _root_.scala.None => EnumUnknownTStatusCode(value)
    }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * Returns None if the value is not found
   */
  def get(value: Int): _root_.scala.Option[org.apache.hive.service.rpc.thrift.TStatusCode] =
    value match {
      case 0 => _SomeSuccessStatus
      case 1 => _SomeSuccessWithInfoStatus
      case 2 => _SomeStillExecutingStatus
      case 3 => _SomeErrorStatus
      case 4 => _SomeInvalidHandleStatus
      case _ => _root_.scala.None
    }

  def valueOf(name: String): _root_.scala.Option[org.apache.hive.service.rpc.thrift.TStatusCode] =
    name.toLowerCase match {
      case "successstatus" => _SomeSuccessStatus
      case "successwithinfostatus" => _SomeSuccessWithInfoStatus
      case "stillexecutingstatus" => _SomeStillExecutingStatus
      case "errorstatus" => _SomeErrorStatus
      case "invalidhandlestatus" => _SomeInvalidHandleStatus
      case _ => _root_.scala.None
    }

  lazy val list: List[org.apache.hive.service.rpc.thrift.TStatusCode] = scala.List[org.apache.hive.service.rpc.thrift.TStatusCode](
    org.apache.hive.service.rpc.thrift.TStatusCode.SuccessStatus,
    org.apache.hive.service.rpc.thrift.TStatusCode.SuccessWithInfoStatus,
    org.apache.hive.service.rpc.thrift.TStatusCode.StillExecutingStatus,
    org.apache.hive.service.rpc.thrift.TStatusCode.ErrorStatus,
    org.apache.hive.service.rpc.thrift.TStatusCode.InvalidHandleStatus
  )
}



@javax.annotation.Generated(value = Array("com.twitter.scrooge.Compiler"))
sealed trait TStatusCode extends ThriftEnum with Serializable