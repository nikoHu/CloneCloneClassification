
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setAbContentView(R.layout.pull_to_refresh_list);
		application = (MyApplication) abApplication;

		mAbTitleBar = this.getTitleBar();
		mAbTitleBar.setTitleText(R.string.pull_list_name);
		mAbTitleBar.setLogo(R.drawable.button_selector_back);
		mAbTitleBar.setTitleBarBackground(R.drawable.top_bg);
		mAbTitleBar.setTitleTextMargin(10, 0, 0, 0);
		mAbTitleBar.setLogoLine(R.drawable.line);

		for (int i = 0; i < 23; i++) {
			mPhotoList.add(Constant.BASEURL
					+ "content/templates/amsoft/images/rand/" + i + ".jpg");
		}

		// 获取ListView对象
		mAbPullToRefreshView = (AbPullToRefreshView) this
				.findViewById(R.id.mPullRefreshView);
		mListView = (ListView) this.findViewById(R.id.mListView);

		// 设置监听器
		mAbPullToRefreshView.setOnHeaderRefreshListener(this);
		mAbPullToRefreshView.setOnFooterLoadListener(this);

		// 设置进度条的样式
		mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));
		mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(
				this.getResources().getDrawable(R.drawable.progress_circular));

		// ListView数据
		list = new ArrayList<Map<String, Object>>();

		// 使用自定义的Adapter
		myListViewAdapter = new ImageListAdapter(this, list,
				R.layout.item_list, new String[] { "itemsIcon", "itemsTitle",
						"itemsText" }, new int[] { R.id.itemsIcon,
						R.id.itemsTitle, R.id.itemsText });
		mListView.setAdapter(myListViewAdapter);

		// item被点击事件
		mListView.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			}
		});

		//显示进度框
		mDialogFragment = AbDialogUtil.showLoadDialog(this, R.drawable.ic_load, "查询中,请等一小会");
		mDialogFragment
		.setAbDialogOnLoadListener(new AbDialogOnLoadListener() {

			@Override
			public void onLoad() {
				// 下载网络数据
				refreshTask();
			}

		});

	}


D:\_python\clone\CloneClassification\data_new\android\AndBase\AndBaseDemo\src\com\andbase\demo\activity\PullToRefreshListActivity.java 34903
========================================================

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setAbContentView(R.layout.pull_to_refresh_list);
        application = (MyApplication)abApplication;
        
        mAbTitleBar = this.getTitleBar();
        mAbTitleBar.setTitleText(R.string.list_pager_name);
        mAbTitleBar.setLogo(R.drawable.button_selector_back);
        mAbTitleBar.setTitleBarBackground(R.drawable.top_bg);
        mAbTitleBar.setTitleTextMargin(10, 0, 0, 0);
        mAbTitleBar.setLogoLine(R.drawable.line);
        
        for (int i = 0; i < 23; i++) {
        	mPhotoList.add(Constant.BASEURL+"content/templates/amsoft/images/rand/"+i+".jpg");
		}
		//获取ListView对象
        mAbPullToRefreshView = (AbPullToRefreshView)this.findViewById(R.id.mPullRefreshView);
        mListView = (ListView)this.findViewById(R.id.mListView);
        
        //设置监听器
        mAbPullToRefreshView.setOnHeaderRefreshListener(this);
        mAbPullToRefreshView.setOnFooterLoadListener(this);
        
        //设置进度条的样式
        mAbPullToRefreshView.getHeaderView().setHeaderProgressBarDrawable(this.getResources().getDrawable(R.drawable.progress_circular));
        mAbPullToRefreshView.getFooterView().setFooterProgressBarDrawable(this.getResources().getDrawable(R.drawable.progress_circular));
        //mAbPullListView.getHeaderView().setHeaderProgressBarDrawable(this.getResources().getDrawable(R.drawable.progress_circular2));
        //mAbPullListView.getFooterView().setFooterProgressBarDrawable(this.getResources().getDrawable(R.drawable.progress_circular2));
        
        //ListView数据
    	list = new ArrayList<Map<String, Object>>();
    	
    	//使用自定义的Adapter
    	myListViewAdapter = new ImageListAdapter(this, list,R.layout.item_list,
				new String[] { "itemsIcon", "itemsTitle","itemsText" }, new int[] { R.id.itemsIcon,
						R.id.itemsTitle,R.id.itemsText });
    	
    	//item被点击事件
    	mListView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
			}
    	});
    	
		//组和个AbSlidingPlayView
        mSlidingPlayView = new AbSlidingPlayView(this);
        
	    final View mPlayView = mInflater.inflate(R.layout.play_view_item, null);
		ImageView mPlayImage = (ImageView) mPlayView.findViewById(R.id.mPlayImage);
		TextView mPlayText = (TextView) mPlayView.findViewById(R.id.mPlayText);
		mPlayText.setText("1111111111111");
		mPlayImage.setBackgroundResource(R.drawable.pic1);
		
		final View mPlayView1 = mInflater.inflate(R.layout.play_view_item, null);
		ImageView mPlayImage1 = (ImageView) mPlayView1.findViewById(R.id.mPlayImage);
		TextView mPlayText1 = (TextView) mPlayView1.findViewById(R.id.mPlayText);
		mPlayText1.setText("2222222222222");
		mPlayImage1.setBackgroundResource(R.drawable.pic2);
		
		final View mPlayView2 = mInflater.inflate(R.layout.play_view_item, null);
		ImageView mPlayImage2 = (ImageView) mPlayView2.findViewById(R.id.mPlayImage);
		TextView mPlayText2 = (TextView) mPlayView2.findViewById(R.id.mPlayText);
		mPlayText2.setText("33333333333333333");
		mPlayImage2.setBackgroundResource(R.drawable.pic3);

		mSlidingPlayView.setNavHorizontalGravity(Gravity.RIGHT);
		mSlidingPlayView.addView(mPlayView);
		mSlidingPlayView.addView(mPlayView1);
		mSlidingPlayView.addView(mPlayView2);
		mSlidingPlayView.startPlay();
		//设置高度
		mSlidingPlayView.setLayoutParams(new AbsListView.LayoutParams(LayoutParams.FILL_PARENT,300));
		mListView.addHeaderView(mSlidingPlayView);
		//解决冲突问题
		mSlidingPlayView.setParentListView(mListView);
		mSlidingPlayView.setOnItemClickListener(new AbSlidingPlayView.AbOnItemClickListener() {
			
			@Override
			public void onClick(int position) {
				AbToastUtil.showToast(ListNestViewPagerActivity.this,"点击"+position);
			}
		});
	    
        mSlidingPlayView.setOnPageChangeListener(new AbSlidingPlayView.AbOnChangeListener() {
			
			@Override
			public void onChange(int position) {
				AbToastUtil.showToast(ListNestViewPagerActivity.this,"改变"+position);
			}
		});
        
        mListView.setAdapter(myListViewAdapter);
        
        AbDialogUtil.showProgressDialog(ListNestViewPagerActivity.this,R.drawable.progress_circular,"正在查询...");

    	//第一次下载数据
    	refreshTask();
    }


D:\_python\clone\CloneClassification\data_new\android\AndBase\AndBaseDemo\src\com\andbase\demo\activity\ListNestViewPagerActivity.java 34906
========================================================
