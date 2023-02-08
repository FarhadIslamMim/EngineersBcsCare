package com.onepointit.mim.engineersbcscare.dependency;


import com.onepointit.mim.engineersbcscare.App;
import com.onepointit.mim.engineersbcscare.LoginActivity;
import com.onepointit.mim.engineersbcscare.MainActivity;
import com.onepointit.mim.engineersbcscare.RegistrationActivity;
import com.onepointit.mim.engineersbcscare.net.RequestServices;
import com.onepointit.mim.engineersbcscare.ui.bcs_routine.BcsRoutineFragment;
import com.onepointit.mim.engineersbcscare.ui.buy_package.BankPackageFragment;
import com.onepointit.mim.engineersbcscare.ui.buy_package.BcsPackageFragment;
import com.onepointit.mim.engineersbcscare.ui.buy_package.BuyPackageFragment;
import com.onepointit.mim.engineersbcscare.ui.dashboard.DashboardFragment;
import com.onepointit.mim.engineersbcscare.ui.notification.NotificationFragment;
import com.onepointit.mim.engineersbcscare.ui.pdf_section.PdfSectionFragment;

import dagger.Component;


@Component(modules = AppModule.class)

public interface AppComponent {

    void inject(MainActivity mainActivity);
    void inject(LoginActivity loginActivity);
    void inject(RegistrationActivity registrationActivity);

    void inject(PdfSectionFragment pdfSectionFragment);

    void inject(NotificationFragment notificationFragment);

    void inject(DashboardFragment dashboardFragment);

    void inject(BuyPackageFragment buyPackageFragment);
    void inject(BcsPackageFragment bcsPackageFragment);
    void inject(BankPackageFragment bankPackageFragment);

    void inject(BcsRoutineFragment bcsRoutineFragment);


//    void inject(MainMenuModel mainMenuModel);
//    void inject(HostActivity hostActivity);
//    void inject(DatePickerFragment datePickerFragment);
//
//    void inject(AssetFragment assetFragment);
//    void inject(CreateAssetFragment createAssetFragment);
//
//    void inject(AttendanceFragment attendanceFragment);
//    void inject(AttendanceListFragment attendanceListFragment);
//    void inject(ApplyLeaveFragment applyLeaveFragment);
//    void inject(LeaveDatePickerFragment leaveDatePickerFragment);
//
//    void inject(BillFragment billFragment);
//    void inject(CreateBillFragment createBillFragment);
//    void inject(BillDatePickerFragment billDatePickerFragment);
//
//    void inject(CustomerFragment customerFragment);
//    void inject(CustomerCreateFragment customerCreateFragment);
//    void inject(DealerFragment dealerFragment);
//
//    void inject(AddDealerPaymentFragment addDealerPaymentFragment);
//    void inject(AddDepotPaymentFragment addDepotPaymentFragment);
//    void inject(PaymentFragment paymentFragment);
//    void inject(PaymentViewPager paymentViewPager);
//    void inject(SetBankDialog setBankDialog);
//    void inject(SetCustomerDialog setCustomerDialog);
//    void inject(com.oshnisoft.erp.btl.ui.cashCollection.DatePickerFragment datePickerFragment);
//
//    void inject(LeaveFragment leaveFragment);
//
//    void inject(AddItemFragment addItemFragment);
//    void inject(AddPriceDialog addPriceDialog);
//    void inject(AddQuantityDialog addQuantityDialog);
//    void inject(CreateDealerOrderFragment createDealerOrderFragment);
//    void inject(CreateDepotOrderFragment createDepotOrderFragment);
//    void inject(CreateCustomerOrderFragment createCustomerOrderFragment);
//    void inject(DatePickerFragmentDate datePickerFragmentDate);
//    void inject(DraftOrderFragment draftOrderFragment);
//    void inject(OrderFragment orderFragment);
//    void inject(OrderPreviewDialog orderPreviewDialog);
//    void inject(OrderPreviewFragment orderPreviewFragment);
//    void inject(OrderViewPager orderViewPager);
//    void inject(com.oshnisoft.erp.btl.ui.order.SetCustomerDialog setCustomerDialog);
//
//    void inject(NotificationActivity notificationActivity);
//    void inject(ChangePasswordActivity changePasswordActivity);
//
//    void inject(MyWorker myWorker);


    final class Initializer {
        private Initializer() {
        }

        public static AppComponent init(App app, RequestServices requestServices) {
            return DaggerAppComponent.builder().appModule(new AppModule(app, requestServices)).build();
        }
    }

}
