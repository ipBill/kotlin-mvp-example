package client.yalantis.com.githubclient.flow.main

import client.yalantis.com.githubclient.model.Repository
import client.yalantis.com.githubclient.mvp.BaseMvpPresenter
import client.yalantis.com.githubclient.mvp.BaseMvpView

/**
 * Created by andrewkhristyan on 10/2/16.
 */
object MainContract {

    interface View : BaseMvpView {
        fun updateViewClickMe()

    }

    interface Presenter : BaseMvpPresenter<View> {
        fun loadClickMe()
    }


}
