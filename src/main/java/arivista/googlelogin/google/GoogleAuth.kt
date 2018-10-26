package arivista.googlelogin.google

import arivista.googlelogin.google.utils.AuthCallback
import arivista.googlelogin.google.utils.AuthData
import arivista.googlelogin.google.utils.AuthDataHolder
import arivista.googlelogin.google.utils.Initializer


public final object GoogleAuth {
    @JvmStatic
    fun connectGoogle(scopes: List<String> = listOf(), listener: AuthCallback) {
        AuthDataHolder.instance.googleAuthData = AuthData(scopes, listener)
        GoogleAuthActivity.start(Initializer.context)
    }

    @JvmStatic
    fun disconnectGoogle() {
        AuthDataHolder.instance.googleAuthData = null
        GoogleAuthActivity.setGoogleDisconnectRequested(Initializer.context, true)
    }

    @JvmStatic
    fun revokeGoogle() {
        GoogleAuthActivity.setGoogleRevokeRequested(Initializer.context, true)
    }


}