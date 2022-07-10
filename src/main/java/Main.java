import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        bagClass();
        callLogToJSON();
    }

    public void bagClass() {
        Student student = new Student("Denys", 20);

        Bag bag = new HashBag();
        bag.add(student, 5);
        bag.remove(student, 1);
        bag.getCount(student);
        bag.add("Hello", 3);
        bag.getCount("Hello");
    }

    public void callLogToJSON() {

        CallLog callLog1 = new CallLog("Tommy", "Lazaro", "+48", 35);

        Gson gson = new Gson();
        String str = gson.toJson(callLog1);
        System.out.println(str);

        CallLog callLog = gson.fromJson(str, CallLog.class);
        System.out.println(callLog.getName() + " | " + callLog.getSurname() + " | "
                + callLog.getPhoneNumber() + " | " + callLog.getDuration());

        Collection<CallLog> callLogCollection = new ArrayList<>();
        callLogCollection.add(new CallLog("Tommy", "Lazaro", "+48", 35));
        callLogCollection.add(new CallLog("Derek", "Chile", "+38", 50));

        String string = gson.toJson(callLogCollection);
        System.out.println(string);

        Type collectionType = new TypeToken<Collection<CallLog>>(){}.getType();
        Collection<CallLog> callLogCollection1 = gson.fromJson(string, collectionType);
        for (CallLog result : callLogCollection1) {
            System.out.println(result.getName());
        }
    }
}
