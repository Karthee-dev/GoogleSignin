package arivista.googlelogin.google.utils

interface AuthCallback {
    fun onSuccess(socialUser: SocialUser)

    fun onError(error: Throwable)

    fun onCancel()
}
