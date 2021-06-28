[![Version](https://img.shields.io/badge/version-1.0.1-green.svg)](https://shields.io/)
[![Open Source Love svg1](https://badges.frapsoft.com/os/v1/open-source.svg?v=103)](https://github.com/ellerbrock/open-source-badges/)

# SendMail
Send Email to Anyone using this library

# How to Implement
To get a Git project into your build:
> Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories: <br/>
```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```
    
> Step 2. Add the dependency

Add it in your root app.gradle at the end of repositories: <br/>
```gradle
dependencies {
	...
    implementation 'com.github.1902shubh:SendMail:1.0.0'
	...
}
```

# How I can send Mail
Simple use cases will look something like this:
```java
 SendMail mail = new SendMail("sender_mail@gmail.com", "sender_pass",
                "papayacoders@gmail.com",
                "Testing Email Sending",
                "Yes, it's working well\nI will use it always.");
mail.execute();
```

## Made with :sparkling_heart: [Papaya Coders](https://papayacoders.in/)
