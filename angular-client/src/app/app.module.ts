import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CityListComponent } from './city-list/city-list.component';
import { CityComponent } from './city/city.component';
import { HttpClientModule } from '@angular/common/http';
import { AngularPaginatorModule } from 'angular-paginator';

@NgModule({
  declarations: [
    AppComponent,
    CityListComponent,
    CityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    AngularPaginatorModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
