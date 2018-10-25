package arivista.login.utils

class AuthDataHolder private constructor() {

    var googleAuthData: AuthData? = null


    companion object {
        val instance = AuthDataHolder()
    }
}
