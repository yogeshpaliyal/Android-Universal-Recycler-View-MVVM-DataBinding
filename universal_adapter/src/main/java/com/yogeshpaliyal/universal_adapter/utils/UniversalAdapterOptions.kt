package com.yogeshpaliyal.universal_adapter.utils

import androidx.annotation.LayoutRes
import androidx.lifecycle.LifecycleOwner
import com.yogeshpaliyal.universal_adapter.adapter.UniversalAdapterViewType


/*
* @author Yogesh Paliyal
* techpaliyal@gmail.com
* https://techpaliyal.com
* created on 08-01-2021 19:54
*/
@Deprecated(
    "Please use @UniversalAdapterBuilder instead of UniversalAdapterOptions",
    replaceWith = ReplaceWith(
        "UniversalAdapterBuilder",
        "com.yogeshpaliyal.universal_adapter.utils.UniversalAdapterBuilder"
    ),
    level = DeprecationLevel.WARNING
)
class UniversalAdapterOptions<T> constructor(
    lifecycleOwner: LifecycleOwner? = null,
    data: Resource<ArrayList<T>?>? = null,
    content: UniversalAdapterViewType.Content<T>? = null,
    loading: UniversalAdapterViewType.Loading<T>? = null,
    loadingFooter: UniversalAdapterViewType.LoadingFooter<T>? = null,
    noData: UniversalAdapterViewType.NoData<T>? = null,
    error: UniversalAdapterViewType.Error<T>? = null
) : UniversalAdapterBuilder<T>(
    lifecycleOwner,
    data,
    content,
    loading,
    loadingFooter,
    noData,
    error
) {
    constructor(
        @LayoutRes
        resource: Int,
        @LayoutRes
        resourceLoading: Int? = null,
        defaultLoadingItems: Int = 5,
        @LayoutRes
        loaderFooter: Int? = null,
        data: Resource<ArrayList<T>?>? = null,
        @LayoutRes
        errorLayout: Int? = null,
        errorListener: Any? = null,
        mListener: Any? = null,
        @LayoutRes
        noDataLayout: Int? = null,
        noDataListener: Any? = null,
        lifecycleOwner: LifecycleOwner? = null
    ) : this(
        lifecycleOwner,
        data,
        UniversalAdapterViewType.Content(resource, mListener),
        UniversalAdapterViewType.Loading(resourceLoading, defaultLoadingItems),
        UniversalAdapterViewType.LoadingFooter(loaderFooter),
        UniversalAdapterViewType.NoData(noDataLayout, noDataListener),
        UniversalAdapterViewType.Error(errorLayout, errorListener)
    )
}

