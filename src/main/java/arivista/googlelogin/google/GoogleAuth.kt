package arivista.googlelogin.google

import arivista.googlelogin.google.utils.AuthCallback
import arivista.googlelogin.google.utils.AuthData
import arivista.googlelogin.google.utils.AuthDataHolder
import arivista.googlelogin.google.utils.Initializer


 public object GoogleAuth {
  @JvmStatic
  fun connectGoogle(scopes: List<String> = listOf(), listener: AuthCallback) {
    AuthDataHolder.instance.googleAuthData = AuthData(scopes, listener)
    GoogleAuthActivity.start(Initializer.context)
  }

  @JvmStatic
  fun disconnectGoogle() {
    AuthDataHolder.instance.googleAuthData = null
    GoogleAuthActivity.setGoogleDisconnectRequested(Initializer.context,true)
  }

  @JvmStatic
  fun revokeGoogle() {
    GoogleAuthActivity.setGoogleRevokeRequested(Initializer.context,true)
  }

//  @JvmStatic
//  fun connectFacebook(scopes: List<String> = listOf(), listener: AuthCallback) {
//    AuthDataHolder.instance.facebookAuthData = AuthData(scopes, listener)
//    FacebookAuthActivity.start(MyApplication.context)
//  }
//
//  @JvmStatic
//  fun disconnectFacebook() {
//    AuthDataHolder.instance.facebookAuthData = null
//    LoginManager.getInstance().logOut()
//  }
//
//  @JvmStatic
//  fun revokeFacebook(callback: RevokeCallback? = null) {
//    GraphRequest(AccessToken.getCurrentAccessToken(),
//            "/me/permissions/", null, HttpMethod.DELETE
//    ) { _ ->
//      disconnectFacebook()
//      callback?.onRevoked()
//    }.executeAsync()
//  }
}