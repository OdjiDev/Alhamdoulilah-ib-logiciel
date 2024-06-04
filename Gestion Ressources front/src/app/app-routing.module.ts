import { PageDashboardComponent } from './pages/page-dashboard/page-dashboard.component';
import { NgModule, ViewChildren } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PageLoginComponent } from './pages/page-login/page-login.component';
import { PageInscriptionComponent } from './pages/page-inscription/page-inscription.component';
import { PageStatistiquesComponent } from './pages/page-statistiques/page-statistiques.component';
import { Router } from '@angular/router';
import { MenuComponent } from './composants/menu/menu.component';
import { PageProduitComponent } from './pages/page-produit/page-produit.component';
const routes: Routes = [
  {
    path: 'login',
     component: PageLoginComponent
    },
    {
      path: 'inscrire',
       component: PageInscriptionComponent
     },
     {
     path: 'produit',
     component: PageProduitComponent
     },

      {
        path: '',
         component: PageDashboardComponent,
         children: [
          {
      path: 'statistiques',
       component: PageStatistiquesComponent
     },


    //  {
    //  path: 'menu',
    //    component:MenuComponent
    //  }
         ]
        }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
