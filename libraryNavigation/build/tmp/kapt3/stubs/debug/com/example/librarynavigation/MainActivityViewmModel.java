package com.example.librarynavigation;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0002\u0010\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/librarynavigation/MainActivityViewmModel;", "Landroidx/lifecycle/ViewModel;", "()V", "modelNetwork", "Landroidx/lifecycle/LiveData;", "Lcom/example/librarynavigation/MainActivityViewmModel$UiModel;", "getModelNetwork", "()Landroidx/lifecycle/LiveData;", "receiver", "Lcom/mobilityado/intermedio/server/ConnectivityBroadcastReceiver;", "connectivityLiveDataToWifiStatusUiModel", "Lcom/example/librarynavigation/MainActivityViewmModel$UiModel$WifiStatus;", "isConnected", "", "(Ljava/lang/Boolean;)Lcom/example/librarynavigation/MainActivityViewmModel$UiModel$WifiStatus;", "UiModel", "libraryNavigation_debug"})
public final class MainActivityViewmModel extends androidx.lifecycle.ViewModel {
    private final com.mobilityado.intermedio.server.ConnectivityBroadcastReceiver receiver = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.librarynavigation.MainActivityViewmModel.UiModel> modelNetwork = null;
    
    @javax.inject.Inject
    public MainActivityViewmModel() {
        super();
    }
    
    private final com.example.librarynavigation.MainActivityViewmModel.UiModel.WifiStatus connectivityLiveDataToWifiStatusUiModel(java.lang.Boolean isConnected) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.librarynavigation.MainActivityViewmModel.UiModel> getModelNetwork() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/librarynavigation/MainActivityViewmModel$UiModel;", "", "()V", "WifiStatus", "Lcom/example/librarynavigation/MainActivityViewmModel$UiModel$WifiStatus;", "libraryNavigation_debug"})
    public static abstract class UiModel {
        
        private UiModel() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/librarynavigation/MainActivityViewmModel$UiModel$WifiStatus;", "Lcom/example/librarynavigation/MainActivityViewmModel$UiModel;", "isConnected", "", "(Z)V", "()Z", "libraryNavigation_debug"})
        public static final class WifiStatus extends com.example.librarynavigation.MainActivityViewmModel.UiModel {
            private final boolean isConnected = false;
            
            public WifiStatus(boolean isConnected) {
                super();
            }
            
            public final boolean isConnected() {
                return false;
            }
        }
    }
}