package br.com.softctrl.mmanagersec.app;

import net.sqlcipher.database.SQLiteDatabase;

public final class MmexApplication extends com.money.manager.ex.MmexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        SQLiteDatabase.loadLibs(this);
    }
}
