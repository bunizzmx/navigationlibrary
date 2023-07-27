package com.example.librarynavigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J(\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0010H\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0015J\b\u0010\u001e\u001a\u00020\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/librarynavigation/MainActivityFlow;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/librarynavigation/utils/Communicator;", "()V", "activity", "binding", "Lcom/example/librarynavigation/databinding/ActivityMainSdkBinding;", "mainActivityViewModel", "Lcom/example/librarynavigation/MainActivityViewmModel;", "getMainActivityViewModel", "()Lcom/example/librarynavigation/MainActivityViewmModel;", "mainActivityViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "backfragment", "", "changeFragment", "titleLabel", "", "visibility", "", "changeFragmentProgress", "part", "", "total", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "libraryNavigation_debug"})
@dagger.hilt.android.AndroidEntryPoint
public final class MainActivityFlow extends androidx.appcompat.app.AppCompatActivity implements com.example.librarynavigation.utils.Communicator {
    private com.example.librarynavigation.databinding.ActivityMainSdkBinding binding;
    private androidx.navigation.NavController navController;
    private com.example.librarynavigation.MainActivityFlow activity;
    private final kotlin.Lazy mainActivityViewModel$delegate = null;
    
    public MainActivityFlow() {
        super();
    }
    
    private final com.example.librarynavigation.MainActivityViewmModel getMainActivityViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    public void changeFragment(@org.jetbrains.annotations.NotNull
    java.lang.String titleLabel, boolean visibility) {
    }
    
    @java.lang.Override
    public void backfragment() {
    }
    
    @java.lang.Override
    public void changeFragmentProgress(@org.jetbrains.annotations.NotNull
    java.lang.String titleLabel, boolean visibility, int part, int total) {
    }
}