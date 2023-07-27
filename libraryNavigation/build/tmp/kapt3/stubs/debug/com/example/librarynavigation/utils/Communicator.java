package com.example.librarynavigation.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J(\u0010\t\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&\u00a8\u0006\r"}, d2 = {"Lcom/example/librarynavigation/utils/Communicator;", "", "backfragment", "", "changeFragment", "titleLabel", "", "visibility", "", "changeFragmentProgress", "part", "", "total", "libraryNavigation_debug"})
public abstract interface Communicator {
    
    public abstract void changeFragment(@org.jetbrains.annotations.NotNull
    java.lang.String titleLabel, boolean visibility);
    
    public abstract void backfragment();
    
    public abstract void changeFragmentProgress(@org.jetbrains.annotations.NotNull
    java.lang.String titleLabel, boolean visibility, int part, int total);
}