package com.inprogress.reactnativeyoutube;

import com.google.android.youtube.player.YouTubePlayerFragment;


public class VideoFragment extends YouTubePlayerFragment {

    private YouTubeView mYouTubeView;
    public void setYouTubeView(YouTubeView youTubeView) {
        mYouTubeView = youTubeView;
    }

    public static VideoFragment newInstance(YouTubeView youTubeView) {
        VideoFragment fragment = new VideoFragment(youTubeView);
        fragment.setYouTubeView(youTubeView);
        return fragment;
    }

    @Override
    public void onResume() {
        mYouTubeView.onVideoFragmentResume();
        super.onResume();
    }
}
