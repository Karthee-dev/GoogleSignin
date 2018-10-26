package arivista.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import arivista.googlelogin.google.GoogleAuth
import arivista.googlelogin.google.utils.AuthCallback
import arivista.googlelogin.google.utils.SocialUser
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val scopes = Arrays.asList(
                "https://www.googleapis.com/auth/youtube",
                "https://www.googleapis.com/auth/youtube.upload")
        GoogleAuth.connectGoogle(scopes, object : AuthCallback {
            override fun onSuccess(socialUser: SocialUser) {

                Log.e("google success", socialUser.fullName)

            }

            override fun onError(error: Throwable) {
                Log.e("google error", error.localizedMessage)

            }

            override fun onCancel() {
            }
        })
    }
}
