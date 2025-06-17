package info.hannes.edgedetection.demo

import android.annotation.SuppressLint
import android.content.ContentResolver
import android.provider.Settings
import com.google.firebase.crashlytics.FirebaseCrashlytics
import info.hannes.crashlytic.CrashlyticsTree
import org.opencv.android.OpenCVLoader
import timber.log.Timber

object Crashlytic {
    @SuppressLint("HardwareIds")
    fun init(contentResolver: ContentResolver) {
        Timber.plant(CrashlyticsTree(Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)))
        FirebaseCrashlytics.getInstance().setCustomKey("VERSION_NAME", BuildConfig.VERSION_NAME)
        FirebaseCrashlytics.getInstance().setCustomKey("OpenCV", OpenCVLoader.OPENCV_VERSION)
    }
}