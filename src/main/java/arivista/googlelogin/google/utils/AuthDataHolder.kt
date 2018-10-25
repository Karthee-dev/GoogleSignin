package arivista.googlelogin.google.utils

class AuthDataHolder private constructor() {

    var googleAuthData: AuthData? = null


    companion object {
        val instance = AuthDataHolder()
    }
}
