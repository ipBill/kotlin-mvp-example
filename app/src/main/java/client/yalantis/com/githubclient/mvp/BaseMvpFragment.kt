package client.yalantis.com.githubclient.mvp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.View

abstract class BaseMvpFragment<in V : BaseMvpView, T : BaseMvpPresenter<V>> : Fragment(), BaseMvpView {

    protected abstract var mPresenter: T

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mPresenter.attachView(this as V)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mPresenter.detachView()
    }

    override fun getContext(): Context {
        return context
    }

    override fun showError(error: String?) {
    }

    override fun showError(stringResId: Int) {
    }

    override fun showMessage(srtResId: Int) {
    }

    override fun showMessage(message: String) {
    }

}