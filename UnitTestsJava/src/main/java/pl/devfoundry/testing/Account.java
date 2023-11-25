package pl.devfoundry.testing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

    private boolean active;
    
    public Account() {
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }

    public boolean isActive() {
        return this.active;
    }

}