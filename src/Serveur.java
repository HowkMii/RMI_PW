import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Serveur {

    public static void main(String[] args) {
        try {
            RemoteImpl remoteImpl = new RemoteImpl();
            IRemote objDis = (IRemote) UnicastRemoteObject.exportObject(remoteImpl, 10000);
            LocateRegistry.createRegistry(10000).bind("objDis", objDis);
            while (1==1) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}