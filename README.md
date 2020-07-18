<h1 align="center">Welcome to InternetChecker 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="#" target="_blank">
    <img alt="License: MIT" src="https://img.shields.io/badge/License-MIT-yellow.svg" />
  </a>
</p>

> Short introduction, this is very simple internet checker, you can execute a function when the device disconnected and otherwise, you can check is connected to the internet for once on execution.

## Simple Usage

1. Forever Checking

   ```kotlin
   val networkConnection = NetworkConnection(applicationContext)
   networkConnection.ObservableNetworkCondition()
   	.observe(this@MainActivity, Observer { isConnected ->
   	if (isConnected) {
           // do something when device connected to internet
   	} else {
           // do something when device disconnected to internet
   	}
   })
   ```

2. Checking for once execution

   ```kotlin
   val networkConnection = NetworkConnection(applicationContext)
   if(networkConnection.isNetworkConnected()){
       // do something when device connected to internet
   }else{
       // do something when device disconnected to internet
   }
   ```

## Author

👤 **Dimas Prasetya**

* Github: [@Dimas-Prasetya](https://github.com/Dimas-Prasetya)

## Show your support

Give a ⭐️ if this project helped you!

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_

