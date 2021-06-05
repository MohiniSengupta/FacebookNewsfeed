package com.dilipkumarg.fk.newsfeed.commands;

import java.util.List;

import com.dilipkumarg.fk.newsfeed.service.PostService;

public class UpvoteCommand implements Command {

    private final PostService postService;

    public UpvoteCommand(final PostService postService) {
        this.postService = postService;
    }

    @Override
    public boolean canAccept(final String command, final List<String> args) {
        return args.size() == 1;
    }

    @Override
    public void execute(final List<String> arguments) {
        postService.addUpvote(Integer.parseInt(arguments.get(0)));
    }
}
