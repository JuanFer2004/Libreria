package excersice.libreria.data;

import android.provider.BaseColumns;

public class PersonaContract {

    public static abstract class PersonaEntry implements BaseColumns {

        public static final String TABLE_NAME = "persona";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String PASSWORD = "password";

    }

}
