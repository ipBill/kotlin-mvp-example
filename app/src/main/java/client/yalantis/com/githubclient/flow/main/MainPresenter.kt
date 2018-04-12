package client.yalantis.com.githubclient.flow.main

import client.yalantis.com.githubclient.api.GeneralErrorHandler
import client.yalantis.com.githubclient.manager.ApiManager
import client.yalantis.com.githubclient.mvp.BaseMvpPresenterImpl
import rx.functions.Action1

/**
 * Created by andrewkhristyan on 10/2/16.
 */
class MainPresenter : BaseMvpPresenterImpl<MainContract.View>(), MainContract.Presenter {

    override fun loadClickMe() {
        mView?.updateViewClickMe()
    }

    companion object {
    }

}