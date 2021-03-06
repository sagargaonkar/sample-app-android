package live.hms.android100ms.ui.meeting

import live.hms.video.HMSPeer
import org.webrtc.AudioTrack
import org.webrtc.VideoTrack

data class MeetingTrack(
  val mediaId: String,
  val peer: HMSPeer,
  val videoTrack: VideoTrack?,
  val audioTrack: AudioTrack?,
  val isCurrentDeviceStream: Boolean = false
) {

  override fun equals(other: Any?): Boolean {
    if (other is MeetingTrack) {
      return other.peer.uid == peer.uid &&
          other.mediaId == mediaId
    }

    return super.equals(other)
  }

  override fun toString(): String {
    val peerStr = "HMSPeer(" +
        "peerId=${peer.peerId}, " +
        "username=${peer.userName}, " +
        "customerUserId=${peer.customerUserId}" +
        ")"
    return "MeetingTrack(" +
        "mid=$mediaId, " +
        "peer=$peerStr, " +
        "hasVideo=${videoTrack != null}, " +
        "hasAudio=${audioTrack != null}, " +
        "isCurrentDeviceStream=$isCurrentDeviceStream" +
        ")"
  }
}
