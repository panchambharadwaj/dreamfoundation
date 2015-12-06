package com.dream.foundation;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    // Initializing WebView
    private WebView mwebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // WebView
        mwebView = (WebView) findViewById(R.id.myWebView);
        WebSettings webSettings = mwebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        // Improve WebView performance
        mwebView.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        mwebView.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        mwebView.getSettings().setAppCacheEnabled(true);
        mwebView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webSettings.setDomStorageEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        webSettings.setUseWideViewPort(true);
        webSettings.setSavePassword(true);
        webSettings.setSaveFormData(true);
        webSettings.setEnableSmoothTransition(true);

        mwebView.loadUrl("https://drive.google.com/open?id=1UDD13pyoeXh66f31BCAUOfAxhvj6Uqa3nUg3WWX1gho");
        Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        // Force links to open in WebView
        mwebView.setWebViewClient(new MyWebviewClient());

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_present_activities) {
            // Handle the camera action
            mwebView.loadUrl("https://drive.google.com/open?id=1wj_JfaxFDQvfpSg0WSMLkcBhoZmlrI3hZYuwPMlN-JM");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_announcements) {
            mwebView.loadUrl("https://drive.google.com/open?id=1kDMyDmOIl5Za2KqjQYEeWpdmpfuAJGOFarJrTMBPAQk");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_reports) {
            mwebView.loadUrl("https://drive.google.com/open?id=0B-cp181SxR7-ekJyNUJrclpHbmM");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_newsletters) {
            mwebView.loadUrl("https://drive.google.com/open?id=0B-cp181SxR7-fi1QODhSekhDMW9GVHd4VXBWTWFHTC1mb3l6T1pwZ1F6QzliNUgyckJxQzA");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_gallery) {
            mwebView.loadUrl("https://drive.google.com/open?id=0B-cp181SxR7-dEt1cWhwZG9ybXc");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_blood_requirement) {
            mwebView.loadUrl("https://drive.google.com/open?id=1eY3xt39qMTmdPYQyXNn5eTU9v0EdEIbOA09fn1I1QIA");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_funds_in_hand) {
            mwebView.loadUrl("https://drive.google.com/open?id=1RhjxLIhnmUSXDNwdgCd4rwDjp5tdeXUOU6jwp0ziEGE");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_help_us_raise_funds) {
            mwebView.loadUrl("https://drive.google.com/open?id=1yOMYzEe6Q3v_X98-z5ULnDU9irg547Q_y-LdSbWofs0");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_archives) {
            mwebView.loadUrl("https://drive.google.com/open?id=0B-cp181SxR7-fkdENkZqX3p1YjVIX1pnSm1Oa2M1TEVGalFQX18tWTZaZXlYQ21TM1MtWmc");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_join_dream) {
            mwebView.loadUrl("https://drive.google.com/open?id=1GRxMAivEtEKYPrmADBjpbNpYNxr0khpOp1d1dA05e7A");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        } else if (id == R.id.nav_contact_us) {
            mwebView.loadUrl("https://drive.google.com/open?id=18astFbR3KbuBgpn5RzieKiV60OZiyU24aMnJ_Ye6VGY");
            Toast.makeText(getApplicationContext(), "Loading... Please wait!", Toast.LENGTH_LONG).show();

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private class MyWebviewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //mwebView.loadUrl(url);
            //return true;
            Uri.parse(url).getHost();
            return false;
        }
    }
    // Goto previous page when pressing back button
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (event.getAction() == KeyEvent.ACTION_DOWN) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_BACK:
                    if (mwebView.canGoBack()) {
                        mwebView.goBack();
                    } else {
                        finish();
                    }
                    return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

}
