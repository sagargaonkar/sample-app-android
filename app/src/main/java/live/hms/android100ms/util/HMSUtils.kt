package live.hms.android100ms.util

import live.hms.video.error.HMSException

fun toString(exception: HMSException): String {
  return "HMSException(" +
      "action=${exception.action}, " +
      "errorCode=${exception.errorCode}, " +
      "message=${exception.errorMessage})"
}

