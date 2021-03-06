    const Profile = Mn.View.extend({
        template: _.template(`
        <div id="search"></div>
        <div id="friends_container"></div>
    `),
        regions: {
            searchRegion: {
                el: '#search'
            },
            friendsRegion: {
                el: '#friends_container'
            }
        },
        onRender() {
            this.showChildView('friendsRegion', friendsContainer);
            this.showChildView('searchRegion', new SearchFriend());
        }
    });
    let profile = new Profile();