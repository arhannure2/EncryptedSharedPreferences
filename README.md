# Encrypted Shared Preferences

# Android-Security
A sample repo that will cover the new AndroidX security, and some other tools that Android provides to secure your data.
  * EncryptedSharedPreferences API from Android Jetpack
  * Android 21 and 22 are now supported on 1.1.0-alpha03 version of this library

## Samples covered
The current project covers these security practices/components:
* EncryptedSharedPreferences
* EncryptedFile



### EncryptedSharedPreferences
A form with two fields that are stored into a encrypted preference file.

![image](https://user-images.githubusercontent.com/57435729/138444220-e81ef227-62a2-4263-a0e4-25bdc25ebefe.png)



### EncryptedFile
It downloads this file and store its content into a encrypted file and reads that file.

![image](https://user-images.githubusercontent.com/57435729/138444309-57385e2b-4450-45b3-9034-9618324da0e6.png)


### Access files and check contents using the Device File Explorer tool from Android Studio
We can access the file and check its contents using the Device File Explorer tool from Android Studio.
![image](https://user-images.githubusercontent.com/57435729/138444161-4b0b5442-4663-46b9-981c-e203da0cd712.png)




## References

* [EncryptedSharedPreferences](https://developer.android.com/reference/androidx/security/crypto/EncryptedSharedPreferences)
* [EncryptedFile](https://developer.android.com/reference/androidx/security/crypto/EncryptedFile)
