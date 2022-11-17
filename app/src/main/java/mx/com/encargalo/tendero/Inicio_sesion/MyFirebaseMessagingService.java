package mx.com.encargalo.tendero.Inicio_sesion;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String token) {
        super.onNewToken(token);

        Log.e("Token", "mi tolekn es :"+token);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage message) {
        super.onMessageReceived(message);
        Log.d("Mensaje","mensaje reecibiddo");
        RemoteMessage.Notification notification= message.getNotification();
        String tittle=notification.getTitle();
        String msg=notification.getBody();


    }
}
