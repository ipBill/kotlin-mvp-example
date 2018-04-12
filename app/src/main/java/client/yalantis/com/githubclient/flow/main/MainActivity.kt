package client.yalantis.com.githubclient.flow.main

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import client.yalantis.com.githubclient.R

class MainActivity : AppCompatActivity(), MainFragment.OnFragmentInteractionListener {

    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onClickButtonUpdateListener() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView(savedInstanceState)
    }

    private fun initView(savedInstanceState: Bundle?) {

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.containerMain, MainFragment.newInstance("param1", "param2"))
                    .commit()
        }

    }
}
