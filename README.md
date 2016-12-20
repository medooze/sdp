# ABNF Java SDP library
This java library allows strict [ABNF](https://raw.githubusercontent.com/medooze/sdp/master/src/org/murillo/abnf/sdp.abnf) SDP parsing and serialization

# Javadoc

https://medooze.github.io/sdp/ 

# Example
``` java
	  SessionDescription sdp = new SessionDescription();
	  Origin origin = new Origin("-", 0L, 0L, "IN", "IP4", "127.0.0.1");
	  sdp.setOrigin(origin);
	  sdp.setSessionName("test");
	  sdp.addMedia(new MediaDescription("aduio", 0, "UDP/AVP"));
    
	  SessionDescription cloned = sdp.clone();
	  System.out.println(sdp.toString());
	  System.out.println(cloned.toString());
	  
	  origin.setSessId(1);
	  System.out.println(sdp.toString());
	  System.out.println(cloned.toString());
```
