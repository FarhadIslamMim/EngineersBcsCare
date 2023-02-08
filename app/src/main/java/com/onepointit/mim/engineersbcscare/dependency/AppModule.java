package com.onepointit.mim.engineersbcscare.dependency;

import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.net.RequestServices;

import java.util.ArrayList;
import java.util.List;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;
import io.realm.RealmConfiguration;



@Module
public class AppModule {

    private App app;
    private RequestServices requestServices;

    AppModule(App app, RequestServices requestServices) {
        this.app = app;
        this.requestServices = requestServices;
    }

    @Provides
    App provideContext() {
        return app;
    }

    @Provides
    Realm provideRealm() {
        RealmConfiguration config = new RealmConfiguration.Builder()
                .allowWritesOnUiThread(true)
                .deleteRealmIfMigrationNeeded()
                .build();
        return Realm.getInstance(config);
    }

//    @Provides
//    List<MainMenuModel> provideMainMenuModelList() {
//        List<MainMenuModel> mainMenuModelList = new ArrayList<>();
//        //create model list
//
//        for (int i = 0; i < MainMenuConstants.getInstance().getMenuTexts().length; i++) {
//            MainMenuModel m = new MainMenuModel();
//            m.setMenuText(MainMenuConstants.getInstance().getMenuTexts()[i]);
//            m.setMenuIcon(MainMenuConstants.getInstance().getMenuIcons()[i]);
//            mainMenuModelList.add(m);
//        }
//        return mainMenuModelList;
//    }
//
//
//    @Provides
//    APIServices provideAPIServices() {
//        return APIClients.getInstance().create(APIServices.class);
//    }
//
//    @Provides
//    RequestServices provideRequestServices() {
//        return requestServices;
//    }
//
//    @Provides
//    User provideUser() {
//        Realm r = provideRealm();
//        return r.where(User.class).findFirst();
//    }
//
//    @Provides
//    UserData provideUserData() {
//        Realm r = provideRealm();
//        UserData userData = r.where(UserData.class).findFirst();
//        if (userData == null) {
//            userData = new UserData();
//            userData.setSecondary_mobile_number("");
//            userData.setZone_id(0);
//            userData.setType("Dealer");
//            userData.setDesignation("Admin");
//        }
//        return userData;
//    }
//
//
//    @Provides
//    List<LeaveTypeModel> provideLeaveType() {
//        Realm r = provideRealm();
//        return r.where(LeaveTypeModel.class).findAll();
//    }
//
//
//    @Provides
//    List<District> provideDistricts() {
//        Realm r = provideRealm();
//        return r.where(District.class).findAll();
//    }
//
//    @Provides
//    List<Zone> provideZones(){
//        Realm r = provideRealm();
//        return r.where(Zone.class).findAll();
//    }
//
//
//
//
//
//    @Provides
//    List<Problem> provideProblems(){
//        Realm r = provideRealm();
//        return r.where(Problem.class).findAll();
//    }
//
//    @Provides
//    List<Product> provideProducts(){
//        Realm r = provideRealm();
//        return r.where(Product.class).findAll();
//    }
//
//    @Provides
//    List<Bank> provideBanks(){
//        Realm r = provideRealm();
//        return r.where(Bank.class).findAll();
//    }
//
//        @Provides
//    List<Dealer> provideDealers(){
//        Realm r = provideRealm();
//        return r.where(Dealer.class).findAll();
//    }


}
