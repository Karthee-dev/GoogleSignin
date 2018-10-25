package arivista.googlelogin.google.utils

public class AuthDataHolder private constructor() {

    var googleAuthData: AuthData? = null


    companion object {
        val instance = AuthDataHolder()
    }
}
