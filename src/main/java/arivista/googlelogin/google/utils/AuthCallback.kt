package arivista.googlelogin.google.utils

public interface AuthCallback {
    fun onSuccess(socialUser: SocialUser)

    fun onError(error: Throwable)

    fun onCancel()
}
