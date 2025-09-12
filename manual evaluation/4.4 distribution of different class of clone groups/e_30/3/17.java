
	public void setProgress(int progress) {
		this.progress = progress;
		this.invalidate();
		if(this.mAbOnProgressListener!=null){
			if(this.max <= this.progress){
				this.mAbOnProgressListener.onComplete();
			}else{
				this.mAbOnProgressListener.onProgress(progress);
			}
		}
	}


D:\_python\clone\CloneClassification\data_new\android\AndBase\AndBase\src\com\ab\view\progress\AbHorizontalProgressBar.java 33886
========================================================

	public void setProgress(int progress) {
		this.progress = progress;
		this.invalidate();
		if(this.mAbOnProgressListener!=null){
			if(this.max <= this.progress){
				this.mAbOnProgressListener.onComplete();
			}else{
				this.mAbOnProgressListener.onProgress(progress);
			}
		}
	}


D:\_python\clone\CloneClassification\data_new\android\AndBase\AndBase\src\com\ab\view\progress\AbCircleProgressBar.java 33891
========================================================
