package com.example.librarynavigation.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0014J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0004H\u0002J\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\tJ\u0016\u0010&\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\tJ\u0016\u0010\'\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0004J\u0016\u0010)\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\tJ\u0016\u0010+\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\tJ\u0016\u0010,\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\tJ\u0016\u0010-\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\tJ\u0016\u0010.\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\u0004J\u0016\u00100\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u00101\u001a\u00020\u0007J \u00102\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0007H\u0002J \u00104\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\u0006\u00103\u001a\u00020\tH\u0002J \u00105\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00042\u0006\u00103\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/example/librarynavigation/common/SharedPreferencesUtils;", "", "()V", "CARDS_BALANCES_LAST_SYNC", "", "CODE_KEY", "DEF_BOOLEAN_VALUE", "", "DEF_LONG_VALUE", "", "DEF_STRING_VALUE", "INCIDENT_LAST_SYNC", "LOCALE_KEY", "POIS_LAST_SYNC", "POIS_VERSION", "PUSH_NOTIFICATIONS_ARE_ENABLED", "RECHARGING_POINTS_LAST_SYNC", "RECHARGING_VERSION", "getCardsBalancesLastSync", "context", "Landroid/content/Context;", "getIncidentLastSync", "getLanguageFromSP", "getPOISVersion", "getPOIsLastSync", "getPushNotificationsAreEnabled", "getRechargingPointVersion", "getRechargingPointsLastSync", "getSharedPreferences", "Landroid/content/SharedPreferences;", "getUserSessionCode", "readBooleanFromSharedPreferences", "key", "readLongFromSharedPreferences", "readStringFromSharedPreferences", "saveCardsBalancesLastSync", "", "lastSync", "saveIncidentLastSync", "saveLanguageInSP", "language", "savePOISVersion", "version", "savePOIsLastSync", "saveRechargingPointVersion", "saveRechargingPointsLastSync", "saveUserSessionCode", "code", "setPushNotificationsAreEnabled", "enabled", "writeBooleanToSharedPreferences", "value", "writeLongToSharedPreferences", "writeStringToSharedPreferences", "libraryNavigation_debug"})
public final class SharedPreferencesUtils {
    @org.jetbrains.annotations.NotNull
    public static final com.example.librarynavigation.common.SharedPreferencesUtils INSTANCE = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String DEF_STRING_VALUE = "DEF_STRING_VALUE";
    private static final boolean DEF_BOOLEAN_VALUE = false;
    private static final long DEF_LONG_VALUE = 0L;
    private static final java.lang.String LOCALE_KEY = "LOCALE_KEY";
    private static final java.lang.String CODE_KEY = "CODE_KEY";
    private static final java.lang.String PUSH_NOTIFICATIONS_ARE_ENABLED = "PUSH_NOTIFICATIONS_ARE_ENABLED";
    private static final java.lang.String INCIDENT_LAST_SYNC = "INCIDENT_LAST_SYNC";
    private static final java.lang.String CARDS_BALANCES_LAST_SYNC = "CARDS_BALANCES_LAST_SYNC";
    private static final java.lang.String RECHARGING_POINTS_LAST_SYNC = "RECHARGING_POINTS_LAST_SYNC";
    private static final java.lang.String POIS_LAST_SYNC = "POIS_LAST_SYNC";
    private static final java.lang.String POIS_VERSION = "POIS_VERSION";
    private static final java.lang.String RECHARGING_VERSION = "RECHARGING_VERSION";
    
    private SharedPreferencesUtils() {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreferences(android.content.Context context) {
        return null;
    }
    
    private final void writeStringToSharedPreferences(android.content.Context context, java.lang.String key, java.lang.String value) {
    }
    
    private final void writeBooleanToSharedPreferences(android.content.Context context, java.lang.String key, boolean value) {
    }
    
    private final void writeLongToSharedPreferences(android.content.Context context, java.lang.String key, long value) {
    }
    
    private final java.lang.String readStringFromSharedPreferences(android.content.Context context, java.lang.String key) {
        return null;
    }
    
    private final boolean readBooleanFromSharedPreferences(android.content.Context context, java.lang.String key) {
        return false;
    }
    
    private final long readLongFromSharedPreferences(android.content.Context context, java.lang.String key) {
        return 0L;
    }
    
    public final void saveUserSessionCode(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String code) {
    }
    
    public final void saveLanguageInSP(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String language) {
    }
    
    public final void saveIncidentLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context, long lastSync) {
    }
    
    public final void saveCardsBalancesLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context, long lastSync) {
    }
    
    public final void saveRechargingPointsLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context, long lastSync) {
    }
    
    public final void savePOIsLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context, long lastSync) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserSessionCode(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLanguageFromSP(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final boolean getPushNotificationsAreEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    public final void setPushNotificationsAreEnabled(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean enabled) {
    }
    
    public final long getIncidentLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
    
    public final long getCardsBalancesLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
    
    public final long getRechargingPointsLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
    
    public final long getPOIsLastSync(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
    
    public final void savePOISVersion(@org.jetbrains.annotations.NotNull
    android.content.Context context, long version) {
    }
    
    public final long getPOISVersion(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
    
    public final void saveRechargingPointVersion(@org.jetbrains.annotations.NotNull
    android.content.Context context, long version) {
    }
    
    public final long getRechargingPointVersion(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return 0L;
    }
}