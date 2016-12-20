# ABNF Java SDP library
This java library allows strict [ABNF](https://raw.githubusercontent.com/medooze/sdp/master/src/org/murillo/abnf/sdp.abnf) SDP parsing and serialization

# Build
```
ant
```

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

``` java
 SessionDescription sdp = SessionDescription.Parse("v=0\r\n" +
	"o=- 3803220250780278427 2 IN IP4 127.0.0.1\r\n" +
	"s=-\r\n" +
	"t=0 0\r\n" +
	"a=msid-semantic: WMS\r\n" +
	"m=application 50895 DTLS/SCTP 5000\r\n" +
	"a=sctpmap:5000 webrtc-datachannel 1024\r\n");
		    
  MediaDescription datachannel = sdp.getMedias().get(0);
  SCTPMapAttribute sctpmap = (SCTPMapAttribute)datachannel.getAttributes("sctpmap").get(0);
  System.out.println(sctpmap.toString());
```
# License

MIT :)
